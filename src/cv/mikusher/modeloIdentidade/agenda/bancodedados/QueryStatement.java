
package cv.mikusher.modeloIdentidade.agenda.bancodedados;

/**
 *
 * @author Miky Mikusher
 */


public enum QueryStatement {

    ADDPROF("insert into professor(nome, telefone, email, sexo, departamento) values(?,?,?,?,?)"),
    LISTPROF("select * from contato where nome like ?"),
    ALTPROF("update contato set nome=?, telefone=?, email=?, sexo=?, departamento=? where id=?"),
    REMOVEPROF("delete from contato where id=?"),
    ADDSTUD("insert into contato (nome, endereco, telefone, email, sexo, grau, disciplinas)" + "values (?,?,?,?,?,?,?)"),
    LISTSTUD("select * from contato where nome like ?"),
    ALTSTUD("update contato set nome=?, endereco=?, telefone=?, email=?, sexo=?, grau=?, disciplinas=? where id=?"),
    REMOVESTUD("delete from contato where id=?");

    
    private final String query;

    
    QueryStatement(String query) {

        this.query = query;
    }

    public String query() {

        return query;
    }
    
}
