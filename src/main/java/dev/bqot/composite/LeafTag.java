package dev.bqot.composite;

public class LeafTag extends HtmlTag {

    private String body;

    public LeafTag(String tagName) {
        this.tagName = this.startTag = tagName;
        StringBuilder sb = new StringBuilder(tagName);
        sb.insert(1, '/');
        this.endTag=sb.toString();
    }

    @Override
    public void setTagBody(String tagBody) {
        this.body=tagBody;
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
    public void generateHtml() {
        System.out.println(startTag+" "+body+" "+endTag);
    }
}
