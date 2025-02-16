package com.nhnacademy.document.element.impl;

import com.nhnacademy.document.element.DocsElement;
import com.nhnacademy.document.visitor.Visitor;
import lombok.Getter;

/**
 * @author : 이성준
 * @since : 1.0
 */

@Getter
public class QuotationElement extends DocsElement {

    private AttributeElement attributeElement;

    public QuotationElement(String string) {
        super(string);
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public void addAttributes(AttributeElement attributeElement) {
        this.attributeElement = attributeElement;
    }
}
