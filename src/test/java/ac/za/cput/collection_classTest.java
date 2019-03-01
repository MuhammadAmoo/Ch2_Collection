package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class collection_classTest {

    collection_Interface coll = new collection_class();

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfig.class);
        coll = (collection_Interface) ctx.getBean("col");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void lists() {
        coll.lists();

        Assert.assertTrue(true);

    }

    @Test
    public void maps() {
    }

    @Test
    public void sets() {



    }
}