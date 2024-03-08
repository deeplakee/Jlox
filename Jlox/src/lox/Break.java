package lox;

public class Break extends RuntimeException{

    Break(Token keyword){
        super(null, null,false,false);
        this.keyword = keyword;
    }
    Token keyword;
}
