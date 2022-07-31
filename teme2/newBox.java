package teme2;
import teme2.newBox.candyCoconut;
public class newBox {
    public static void main(String[] args){
        newBox newBox = new newBox();

        String name ="RaffaelloC";
        String colour ="AlbRosuVerde";
    }

    class Candy {
        protected String candyAlmond;
        protected String candyCoconut;
    }

    public class candyCoconut{
        protected String candyCoconut(){
            return "candyCoconut";
        }
    }
    public class caramelCandy{
        private String name() {
            return "Caramel";
        }
    }

}

public class candyAlmond extends candyCoconut {
    protected void caramelCandy(String taste){
        return ;
    }


}
}
