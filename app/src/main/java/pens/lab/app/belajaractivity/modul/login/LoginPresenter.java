package pens.lab.app.belajaractivity.modul.login;

/**
 * Created by fahrul on 13/03/19.
 */

public class LoginPresenter implements pens.lab.app.belajaractivity.modul.login.LoginContract.Presenter{
    private final pens.lab.app.belajaractivity.modul.login.LoginContract.View view;



    public LoginPresenter(pens.lab.app.belajaractivity.modul.login.LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void performLogin(final String email, final String password){
        //proses login
        //if login success call redirect to profile
        view.redirectToProfile();
    }

}
