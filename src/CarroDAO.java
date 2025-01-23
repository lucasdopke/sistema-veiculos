import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarroDAO {
    public void cadastrarCarro(Carro carro) {

        String sql = "insert into carros (marca, modelo, ano, capacidadePortaMalas) values(?,?,?,?)";

        PreparedStatement stmt = null;
        try {
            stmt = conexaoDB.getConnection().prepareStatement(sql);
            stmt.setString(1, carro.getMarca());
            stmt.setString(2, carro.getModelo());
            stmt.setInt(3, carro.getAno());
            stmt.setInt(4, carro.getCapacidadePortaMalas());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
