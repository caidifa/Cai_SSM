import java.util.ArrayList;
import java.util.List;

/**
 * Created by caibaolong on 2019/6/11.
 */
public class Node {
    private Node LNode;
    private Node RNode;
    private Integer value;

    public void add(Integer t) {
        if (null == value) {
            value = t;
        } else {
            if (t <= value) {
                if (LNode == null) {
                    LNode = new Node();
                }
                LNode.add(t);
            } else {
                if (RNode == null) {
                    RNode = new Node();
                }
                RNode.add(t);
            }
        }
    }

    public List<Object> values() {
        List<Object> values = new ArrayList<>();

        // 左节点的遍历结果
        if (null != LNode) {
            values.addAll(LNode.values());
        }

        // 当前节点
        values.add(value);

        // 右节点的遍历结果
        if (null != RNode) {
            values.addAll(RNode.values());
        }

        return values;
    }
}
