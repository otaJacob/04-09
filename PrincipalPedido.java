package Enum;

public class PrincipalPedido {

	public static void main(String[] args) {
		StatusPedido status = StatusPedido.ABERTO;
		
		System.out.println(status); // ABERTO
		
		StatusPedido status1 = StatusPedido.CANCELADO;
		
		System.out.println(status1); // CANCELADO
		
		StatusPedido status11 = StatusPedido.EM_ANDAMENTO;
		
		System.out.println(status11); // EM_ANDAMENTO
		
		StatusPedido status111 = StatusPedido.ENTREGUE;
		System.out.println(status111); // EMTREGUE
		

	}

}
