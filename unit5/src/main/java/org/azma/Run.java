package org.azma;

import org.azma.enums.Drink;
import org.azma.interfaces.ExampleInterface;
import org.azma.interfaces.Penguin;

public class Run {
    private static final int speed = 1;
    private static final int power = 100;

    /************** Inner/member inner/Non-Static Nested Classes *************/
     public class RecoveryRun extends Penguin implements Drink {

        private static final int speed = 50;

        public void recoveryRun() {
           // SpeedProgressionRun speedProgressionRun = new SpeedProgressionRun();
            System.out.println("4- Recovery class  with  speed : " + speed);
            System.out.println("4- Recovery class  with  power : " + power);

        }

        @Override
        public void prepare() {
            System.out.println("interface");
        }

        @Override
        public long price() {
            return 0;
        }
    }

    /************** Local Nested Classes *************/
    private class ProgressionRun extends RecoveryRun{
        private void progressionRun() {
            System.out.println("3- ProgressionRun class  with  speed : " + speed);
            class SpeedProgressionRun {
                void speedProgressionRun() {
                    System.out.println("3- SpeedProgressionRun class  with Run speed : " + Run.speed);
                }
            }
            SpeedProgressionRun speedProgressionRun = new SpeedProgressionRun();
            speedProgressionRun.speedProgressionRun();
        }
    }

    /************** Static Nested Classes *************/
      static class LongRun {
        private static final int speedLongRun = 10;
        private void longRun() {
            System.out.println("1- LongRun class  with Run speed : " + Run.speed);
            System.out.println("1- LongRun class  with Long Run speed : " + speedLongRun);
        }
    }
      static class BaseRun {
        private void baseRun() {
            System.out.println("2- BaseRun class  with speed : " + Run.speed);
        }
    }

    /************** Anonymous Nested Classes *************/
    public class AnonymousClasses {
        private static final int number = 10;

        public int anonymousClasses() {
            ExampleInterface penguin =  new ExampleInterface() {

                @Override
                public void abstractMethod() {

                }

                @Override
                public void numberPenguin() {

                }
            };

          return 10;
        };
    }

    public void callRuns(){

        var longRun = new LongRun();
        longRun.longRun();

        var baseRun = new BaseRun();
        baseRun.baseRun();

        var progressionRun = new ProgressionRun();
        progressionRun.progressionRun();

        var recoveryRun = new RecoveryRun();
        recoveryRun.recoveryRun();

        var anonymousClasses = new AnonymousClasses();
        anonymousClasses.anonymousClasses();
        anonymousClasses.anonymousClasses();
    }
}