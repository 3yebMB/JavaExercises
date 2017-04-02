/**
 * Class SimpleBot
 *
 * @author Sergey Iryupin
 * @version 0.1 dated Apr 2, 2016
 */
package bot;
import java.util.*;

public class SimpleBot {
    static final String BOT_NAME = "Bot: ";
    static final String[] COMMON_PHRASES = {
        "��� ������ ������ ����, ��������� � ����� � �� �������.",
        "����� �������� ����� ������� ������, ������ ���� ����.",
        "������ ��� �������� ��������� - ����� �� ���� �����?",
        "�������� � ��������� ���� ������� � ������� ����.",
        "����������� ���� ������� ���������������� ���.",
        "����� ����� ������, �� ����� � ��������.",
        "������� ������� � ���� ����� ����������.",
        "��������� �����, �� ��������� �� ����.",
        "��� ���� ������, ��� ���� ��������.",
        "����� ��� ����� - �� �� ������."};
    static final String[] ELUSIVE_ANSWERS = {
        "�� ������, ��� ���������� ���� �����������.",
        "����� ����� ���-�� �� �����, ��� �����.",
        "��������, �� ��� ����� ������ ������.",
        "����� ����� ��� ����� �� �����������.",
        "�� ������������� ������ ��� �����?",
        "������, �� ��� ���������� ����."};

    public SimpleBot() {
    }

    public String sayInReturn(String msg) {
        Random random = new Random();
        return BOT_NAME + 
            ((msg.charAt(msg.length() - 1) == '?')?
            ELUSIVE_ANSWERS[random.nextInt(ELUSIVE_ANSWERS.length)]:
            COMMON_PHRASES[random.nextInt(COMMON_PHRASES.length)]);
    }
}