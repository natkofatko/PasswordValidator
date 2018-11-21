package sample;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class PasswordScore {




        private DoubleProperty Passwordscore;

        public final double getPasswordscore() {
            if (Passwordscore != null)
                return Passwordscore.get();
            return 0;
        }

        public void setPasswordscore(double passwordscore) {
            this.numberProperty().set(passwordscore);
        }

        public final DoubleProperty numberProperty() {
            if (Passwordscore == null)
                Passwordscore = new SimpleDoubleProperty(0);
            return Passwordscore;
        }

    }

