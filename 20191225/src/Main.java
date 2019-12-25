/**
 * Created with IntelliJ IDEA.
 * Description:实现扑克牌 创建一副扑克牌，随机洗牌和摸牌
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

class Card {
    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        String temp = value+"";
        switch (value) {
            case 11:
                temp = "J";
                break;
            case 12:
                temp = "Q";
                break;
            case 13:
                temp = "K";
                break;
        }
        return suit+""+temp;
    }
}

class MyCards {
    private String[] color={"♥","♠","♦","♣"};
    public List<Card> creatCard() {
        List<Card> L = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13 ; j++) {
                Card card = new Card(color[i],j);
                L.add(card);
            }
        }
        return L;
    }

    private void swap(List<Card> cards,int i,int j) {
        Card temp = cards.get(i);
        cards.set(i,cards.get(j));
        cards.set(j,temp);
    }
    public void xiCard(List<Card> cards) {
        for (int i = 51; i >0; i--) {
            //然后在前i张牌中随机得到一张
            Random random = new Random(new Date().getTime());
            int j = random.nextInt(i);
            //然后进行交换
            swap(cards,i,j);
        }

    }

    public List<List<Card>> zhuaCard(List<Card> cards,int hands,int number) {
        List<List<Card>> ret = new ArrayList<>();
        for (int i = 0;i < hands; i++) {
            ret.add(new ArrayList<>());
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < hands ; j++) {
                Card tmp = cards.remove(cards.size()-1);
                ret.get(j).add(tmp);
            }
        }
        return ret;
    }

}
public class Main {
    public static void main(String[] args) {
        MyCards cd = new MyCards();
        List<Card> L = cd.creatCard();
        System.out.println(L);

        cd.xiCard(L);
        System.out.println(L);
        List<List<Card>> ret = cd.zhuaCard(L,3,5);
        System.out.println(ret);
        System.out.println(L);
    }
}
