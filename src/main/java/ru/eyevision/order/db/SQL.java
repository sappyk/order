package ru.eyevision.order.db;

import ru.eyevision.order.entity.Order;

import java.sql.*;

public class SQL {

    public static void insertNewOrder(Order order) {

        String sql = "INSERT INTO pa_schema.order (last_name, name, patronymic, phone_number, dal_od, dal_cyl_od, " +
                "dal_ax_od, dal_os, dal_cyl_os, dal_ax_os, bliz_od, bliz_os, srednee_os, srednee_od, rasst_dal, " +
                "orders, \"comment\", order_date, birthday, bliz_cyl_od, bliz_ax_od, bliz_cyl_os, " +
                "bliz_ax_os, rasst_bliz, srednee_cyl_od, srednee_ax_od, srednee_cyl_os, srednee_ax_os, rasst_srednee, \"number\") " +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        int number = 0;

        try {
            number = selectMaxNumber();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (Connection connection = DbConnection.connectPostgreSQL();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, order.getLastName());
            statement.setString(2, order.getName());
            statement.setString(3, order.getPatronymic());
            statement.setString(4, order.getPhone_number());
            statement.setString(5, order.getDal_od());
            statement.setString(6, order.getDal_cyl_od());
            statement.setString(7, order.getDal_ax_od());
            statement.setString(8, order.getDal_os());
            statement.setString(9, order.getDal_cyl_os());
            statement.setString(10, order.getDal_ax_os());
            statement.setString(11, order.getBliz_od());
            statement.setString(12, order.getBliz_os());
            statement.setString(13, order.getSrednee_os());
            statement.setString(14, order.getSrednee_od());
            statement.setString(15, order.getRasst_dal());
            statement.setString(16, order.getOrders());
            statement.setString(17, order.getComment());
            if (order.getOrderDate() == null) {
                statement.setDate(18, null);
            } else {
                statement.setDate(18, Date.valueOf(order.getOrderDate()));
            }
            if (order.getBirthday() == null) {
                statement.setDate(19, null);
            } else {
                statement.setDate(19, Date.valueOf(order.getBirthday()));
            }
            statement.setString(20, order.getBliz_cyl_od());
            statement.setString(21, order.getBliz_ax_od());
            statement.setString(22, order.getBliz_cyl_os());
            statement.setString(23, order.getBliz_ax_os());
            statement.setString(24, order.getRasst_bliz());
            statement.setString(25, order.getSrednee_cyl_od());
            statement.setString(26, order.getSrednee_ax_od());
            statement.setString(27, order.getSrednee_cyl_os());
            statement.setString(28, order.getSrednee_ax_os());
            statement.setString(29, order.getRasst_srednee());
            statement.setInt(30, number);
            statement.executeUpdate();

        } catch (SQLException | ClassNotFoundException throwables) {
            System.out.println(throwables);
        }
    }

    public static int selectMaxNumber(){
        int number = 0;
        try (Connection connection = DbConnection.connectPostgreSQL();
             PreparedStatement statement = connection.prepareCall(
                     "select max(\"number\") FROM pa_schema.\"order\"")) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                number = rs.getInt("max");
                number = number + 1;
            }
            rs.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return number;
    }
}