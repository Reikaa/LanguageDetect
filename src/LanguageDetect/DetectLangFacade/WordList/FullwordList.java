package LanguageDetect.DetectLangFacade.WordList;

import LanguageDetect.DetectLangFacade.WordList.Parse.FullWordParse;

/**
 * Created by MuratCan on 3.1.2016.
 */
public class FullwordList extends WordList {
    public FullwordList(String string) {
        setParsingType(new FullWordParse());
        setList(getParsingType().parse(string));
    }
}