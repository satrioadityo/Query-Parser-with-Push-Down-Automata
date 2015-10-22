package sqlparser;

/**
 * @author  Satrio Adityo
 * date Nov 7, 2014
 */
public class Dict {
    private String kata, besaranLexic;
    private int tokenLexic;

    public Dict(String kata, String besaranLexic, int tokenLexic) {
        this.kata = kata;
        this.besaranLexic = besaranLexic;
        this.tokenLexic = tokenLexic;
    }

    public Dict() {
    }

    public String getKata() {
        return kata;
    }

    public void setKata(String kata) {
        this.kata = kata;
    }

    public String getBesaranLexic() {
        return besaranLexic;
    }

    public void setBesaranLexic(String besaranLexic) {
        this.besaranLexic = besaranLexic;
    }

    public int getTokenLexic() {
        return tokenLexic;
    }

    public void setTokenLexic(int tokenLexic) {
        this.tokenLexic = tokenLexic;
    }
    
    
    
    
}
