package br.com.soap.dao;

import br.com.soap.modelos.TesteObject;
import org.apache.commons.lang.StringUtils;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;


public class LogDao {

    @Inject
    private EntityManager entityManager;

    public LogDao(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public LogDao(){}

    public void adicionaLog(TesteObject testeObject){
        entityManager.getTransaction().begin();
        entityManager.persist(testeObject);
        entityManager.getTransaction().commit();
    }

    public void adicionaListaLogs(List<TesteObject> testeObjects){
        entityManager.getTransaction().begin();
        for (TesteObject testeObject : testeObjects){
            entityManager.persist(testeObject);
        }
        entityManager.getTransaction().commit();
    }

    public List<TesteObject> listaLogs(int numeroPagina, int tamanhoPagina, int colunaOrdenacao, String direcaoOrdenacao, String busca){
            String jpql = "select l from TesteObject l ";

            if (busca != null && !busca.equals("")) {
                jpql += "where (l.ip like :busca " +
                        "or l.request like :busca ";

                if (StringUtils.isNumeric(busca)) {
                    jpql += "or cast(l.status as string) like :busca) ";
                } else {
                    jpql += ")";
                }
            }

            switch (colunaOrdenacao) {
                case 0:
                    jpql += "order by l.date ";
                    break;
                case 1:
                    jpql += "order by l.ip ";
                    break;
                case 2:
                    jpql += "order by l.request ";
                    break;
                case 3:
                    jpql += "order by l.status ";
                    break;
                case 4:
                    jpql += "order by l.userAgent ";
                    break;
            }

            jpql += direcaoOrdenacao;

            TypedQuery<TesteObject> query = this.entityManager.createQuery(jpql, TesteObject.class);
            query.setFirstResult(numeroPagina);
            query.setMaxResults(tamanhoPagina);
            if (busca != null && !busca.equals("")) {
                query.setParameter("busca", "%" + busca + "%");
            }
            return query.getResultList();
    }

    public String contarLogs(){
        String jpql = "select count(l.id) from TesteObject l order by l.id desc";
        Query query = entityManager.createQuery(jpql);
        return query.getSingleResult().toString();
    }
}
