package fiveKYU.Exc2;

import org.w3c.dom.Node;

import java.util.ArrayList;

public class LoopInspector {
    public static int loopSize(Node node) {
        ArrayList<Node> loopArr = new ArrayList<Node>();
        while (!loopArr.contains(node)) {
            loopArr.add(node);
            node = node.getNextSibling();
        }
        int firstIndex = Math.max(0, loopArr.indexOf(node));
        return loopArr.size() - firstIndex;
    }
}
