package cl.altiuz.test.model;

public class MessageResponse {
	private int code;
	private String Message;
	
	public MessageResponse() {
		super();
	}

	public MessageResponse(int code, String message) {
		super();
		this.code = code;
		Message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

}
