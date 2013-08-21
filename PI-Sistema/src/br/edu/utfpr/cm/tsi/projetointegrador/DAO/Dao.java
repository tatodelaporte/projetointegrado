package br.edu.utfpr.cm.tsi.projetointegrador.DAO;


import java.util.List;

/**
 *
 * @author Daniel
 */
public interface Dao<T> {

    void persist(T o) throws Exception;

    void delete(T o) throws Exception;

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    T retrieve(T o) throws Exception;

    List<T> list(T o) throws Exception;

   
}
