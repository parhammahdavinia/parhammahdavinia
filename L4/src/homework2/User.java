package homework2;

public class User implements Cloneable{
        public String Username;
        @Override
        protected Object clone ()
            throws
            CloneNotSupportedException {
            return super.clone();
        }
}
