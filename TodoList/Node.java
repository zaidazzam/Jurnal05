package TodoList;

import java.util.*;

public class Node {
    protected String data;
    protected Node link;


    public Node()
    {
        link = null;
        data = "Data Kosong";
    }

    public Node(String d, Node n)
    {
        data = d;
        link = n;
    }

    public void setLink(Node n)
    {
        link = n;
    }

    //  Function to set data to current Node
    public void setData(String d)
    {
        data = d;
    }

    //  Function to get link to next node
    public Node getLink()
    {
        return link;
    }

    //  Function to get data from current Node
    public String getData()
    {
        return data;
    }
}
