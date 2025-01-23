import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MotoDAO {
    public void cadastrarMoto(Moto moto) {

        String sql = "insert into motos (marca , modelo , ano , bagageiro) values(?,?,?,?)";

        PreparedStatement stmt = null;
        try {
            stmt = conexaoDB.getConnection().prepareStatement(sql);
            stmt.setString(1, moto.getMarca());
            stmt.setString(2, moto.getModelo());
            stmt.setInt(3, moto.getAno());
            stmt.setBoolean(4, moto.TemBagageiro());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
