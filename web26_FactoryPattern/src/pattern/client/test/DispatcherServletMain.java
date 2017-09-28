package pattern.client.test;


import pattern.action.Action;
import pattern.action.ActionFactory;

/*
 * Factory Method pattern
 * ::
 * �߻�ȭ �� Ŭ����(Action)�� �ν��Ͻ���(����ü Ȥ�� ���۳�Ʈ) �����ϰ� ��ȯ�޴� ���
 * ����ü�� �����ϴ� ���� �̱��� �������� ���ư��� Factory
 * �̶� command ���� ���� ���� �ٸ� ����ü�� ��������µ�...(Command pattern)
 * ������ ��ü�� �ٽ� ��ȯ�Ҷ��� �߻�ȭ �� Ŭ������ �Ѵ�.
 * 
 * �ᱹ Ŭ���̾�Ʈ�� (DispatcherServlet) Factory�� �Ͽ��� ���۳�Ʈ ������ ���鵵�� ��û
 * Factory�� ���۳�Ʈ�� ���� ���·� �߻�ü�� �����Ѵ�.
 * Ŭ���̾�Ʈ�� �߻�ü�� ����� ȣ�� 
 * �������� ������Ʈ�� ����� �����Ѵ�.
 */
public class DispatcherServletMain {
	public static void main(String[] args) {
		String command = "INSERT";
		
		ActionFactory factory = ActionFactory.getFactory();
		
		Action action = factory.createAction(command);

		action.execute();
	}

}
