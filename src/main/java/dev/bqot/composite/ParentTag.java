package dev.bqot.composite;

import java.util.ArrayList;
import java.util.List;

public class ParentTag extends HtmlTag {

    private List<HtmlTag> children;

    public ParentTag(String tagName) {
        this.tagName = this.startTag = tagName;
        StringBuilder sb = new StringBuilder(tagName);
        sb.insert(1, '/');
        this.endTag=sb.toString();
        this.children=new ArrayList<>();
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag=tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag=tag;
    }

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        this.children.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        this.children.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return this.children;
    }

    @Override
    public void generateHtml() {
        System.out.println(this.startTag);
        for (HtmlTag child : children) {
            child.generateHtml();
        }
        System.out.println(this.endTag);
    }
}
