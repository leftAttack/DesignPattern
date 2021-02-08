package CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yue_
 * @create 2021-02-04-22:03
 */
public class Composite implements Component{

    private List<Component> components = new ArrayList<>();

    public void addComponent(Component component){
        components.add(component);
    }

    @Override
    public int count() {
        int sum = 0;
        for(Component component : components){
            sum += component.count();
        }
        return sum;
    }
}
