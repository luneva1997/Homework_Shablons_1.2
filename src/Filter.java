import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int i = 0;
        for (int e: source){
            if (e>=treshold) {
                result.add(e);
                logger.log("Элемент \"" + e + "\" проходит");
                i += 1;
            } else {
                logger.log("Элемент \"" + e + "\" не проходит");
            }
        }
        logger.log("Прошло фильтр " + i + " элементов из " + source.toArray().length);
        return result;
    }
}
