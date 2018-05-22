package com.galvanize;

import org.junit.Assert;
import org.junit.Test;

public class FormatterTest {

    @Test
    public void formatsLines() {
        String[] lines = new String[8];
        lines[0] = "<a>";
        lines[1] = "<b>";
        lines[2] = "</b>";
        lines[3] = "<c>";
        lines[4] = "<d>";
        lines[5] = "</d>";
        lines[6] = "</c>";
        lines[7] = "</a>";
        Formatter formatter = new Formatter(lines);
        formatter.format();
        String[] newLines = new String[8];
        newLines[0] = "<a>";
        newLines[1] = "\t<b>";
        newLines[2] = "\t</b>";
        newLines[3] = "\t<c>";
        newLines[4] = "\t\t<d>";
        newLines[5] = "\t\t</d>";
        newLines[6] = "\t</c>";
        newLines[7] = "</a>";
        Assert.assertEquals(newLines[0], formatter.getLines()[0]);
        Assert.assertEquals(newLines[1], formatter.getLines()[1]);
        Assert.assertEquals(newLines[2], formatter.getLines()[2]);
        Assert.assertEquals(newLines[3], formatter.getLines()[3]);
        Assert.assertEquals(newLines[4], formatter.getLines()[4]);
        Assert.assertEquals(newLines[5], formatter.getLines()[5]);
        Assert.assertEquals(newLines[6], formatter.getLines()[6]);
        Assert.assertEquals(newLines[7], formatter.getLines()[7]);
    }
}
