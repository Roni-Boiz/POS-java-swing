package dao;

import dao.custom.OrderDetailDAO;
import dao.custom.impl.CustomerDAOImpl;
import dao.custom.impl.ItemDAOImpl;
import dao.custom.impl.OrderDaoImpl;
import dao.custom.impl.OrderDetailDAOImpl;

public class DAOFactory {
    
    private static DAOFactory dAOFactory;
    
    private DAOFactory() {
    }
   
    public static DAOFactory getInstance(){
        if (dAOFactory==null) {
            dAOFactory=new DAOFactory();
        }
    return dAOFactory;
    }
    
    public enum DAOTypes{
    CUSTOMER,ITEM,ORDER,ORDERDETAIL
    }
    
    public <T extends SuperDAO>T getDAO(DAOTypes types){
        switch (types) {
            case CUSTOMER:
                return (T) new CustomerDAOImpl();
            case ITEM:
                return (T) new ItemDAOImpl();
            case ORDER:
                return (T) new OrderDaoImpl();
            case ORDERDETAIL:
                return (T) new OrderDetailDAOImpl();
            default:
                return null;
        }
    }
}
