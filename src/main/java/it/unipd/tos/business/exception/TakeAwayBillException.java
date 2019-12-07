////////////////////////////////////////////////////////////////////
// [ALBERTO] [GOBBO] [1170556]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business.exception;

public class TakeAwayBillException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public TakeAwayBillException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }
    public String getMessagge(){
        return super.getMessage();
    }
}
