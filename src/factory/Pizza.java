package factory;

/**
 * Created by levente on 2017.05.31..
 */
public abstract class Pizza {

    public abstract void prepare();

    public void bake(){
        System.out.println("Baking pizza");
    }

    public void cut() {
        System.out.println("Cut the fresh pizza");
    }

    public void box(){
        System.out.println("Boxing the finished product");
    }
}
