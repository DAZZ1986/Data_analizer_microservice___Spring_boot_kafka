package org.example.config;

import com.jcabi.xml.XML;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class TextXPath {
    //данный класс нам помогает читать/парсить данные из XML

    private final XML xml;
    private final String node;


    @Override
    public String toString() {
        return this.xml.nodes(this.node)
                .get(0)
                .xpath("text()")
                .get(0);
    }

}
