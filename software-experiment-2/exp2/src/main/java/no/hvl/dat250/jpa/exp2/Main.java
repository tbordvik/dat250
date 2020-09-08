package no.hvl.dat250.jpa.exp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "banks";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        // create an entity manager so that the database is created
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.close();
    }
}
