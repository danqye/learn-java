package basics;

/**
 * Created by danqingye on 7/21/16.
 */
public class Normal {
    private Normal instance = null;


    public Normal getInstance() {
        if (instance == null) {
            instance = new Normal();
        }
        return instance;
    }


}
