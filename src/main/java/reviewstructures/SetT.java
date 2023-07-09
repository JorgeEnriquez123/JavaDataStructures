package reviewstructures;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetT {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue")); // 1
        balls.add(new Ball("yellow")); // 2
        balls.add(new Ball("red")); // 3
        balls.add(new Ball("pink")); // 4
        balls.add(new Ball("cyan")); // 5
        balls.add(new Ball("cyan")); // -
        balls.add(new Ball("cyan")); // -
        balls.add(new Ball("cyan")); // -

        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }
    record Ball(String color){}
    //IF YOU WORK WITH A NORMAL CLASS, YOU NEED TO OVERRIDE EQUALS
    /*static class Ball2{
        String color;

        public Ball2(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball2 ball2 = (Ball2) o;
            return Objects.equals(color, ball2.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball2{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }*/
}
