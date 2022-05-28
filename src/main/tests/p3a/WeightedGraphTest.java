package p3a;

import de.unistuttgart.dsass2022.ex06.p2.WeightedGraph;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;


public class WeightedGraphTest {

    @Test
    public void testEdgeList() {
        ArrayList<Integer> list = getWeightedEdgeList();

        WeightedGraph<Integer, Integer> graph = new WeightedGraph<>();
        graph.createFromEdgeList(list);
        ArrayList<Integer> testee = graph.toEdgeList();

        assertEquals(getWeightedEdgeList(), testee);
    }

     @Test
     public void testNodeList() {
        ArrayList<Integer> list = getWeightedNodeList();

        WeightedGraph<Integer, Integer> graph = new WeightedGraph<>();
        graph.createFromNodeList(list);
        ArrayList<Integer> testee = graph.toNodeList();

        assertEquals(getWeightedNodeList(), testee);
     }

    private ArrayList<Integer> getWeightedNodeList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(11);

        list.add(2);
        list.add(2);
        list.add(11);
        list.add(3);
        list.add(12);

        list.add(0);

        list.add(3);
        list.add(1);
        list.add(10);
        list.add(4);
        list.add(13);
        list.add(6);
        list.add(17);

        list.add(1);
        list.add(1);
        list.add(14);

        list.add(2);
        list.add(3);
        list.add(19);
        list.add(5);
        list.add(20);

        list.add(3);
        list.add(2);
        list.add(15);
        list.add(4);
        list.add(16);
        list.add(5);
        list.add(18);

        return list;
    }

    private ArrayList<Integer> getWeightedEdgeList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(11);

        list.add(1);
        list.add(2);
        list.add(11);

        list.add(1);
        list.add(3);
        list.add(12);

        list.add(3);
        list.add(1);
        list.add(10);

        list.add(3);
        list.add(4);
        list.add(13);

        list.add(3);
        list.add(6);
        list.add(17);

        list.add(4);
        list.add(1);
        list.add(14);

        list.add(5);
        list.add(3);
        list.add(19);

        list.add(5);
        list.add(5);
        list.add(20);

        list.add(6);
        list.add(2);
        list.add(15);

        list.add(6);
        list.add(4);
        list.add(16);

        list.add(6);
        list.add(5);
        list.add(18);

        return list;
    }

}
