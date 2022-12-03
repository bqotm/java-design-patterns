package dev.bqot.composite;


public class Test {


    public static void main(String[] args) {
        HtmlTag parent=new ParentTag("<body>");
        HtmlTag c1=new LeafTag("<p>");
        c1.setTagBody("paragraph");
        HtmlTag c2=new LeafTag("<h1>");
        c2.setTagBody("this is a header");
        HtmlTag c3=new LeafTag("<img>");
        c3.setTagBody("image");
        parent.addChildTag(c1);
        parent.addChildTag(c2);
        parent.addChildTag(c3);
        HtmlTag root=new ParentTag("<root>");
        root.addChildTag(parent);

        root.generateHtml();

    }

}
