package pens.lab.app.belajaractivity.modul.add;

/**
 * Created by fahrul on 13/03/19.
 */

public class AddPresenter implements pens.lab.app.belajaractivity.modul.add.AddContract.Presenter{
    private final pens.lab.app.belajaractivity.modul.add.AddContract.View view;

    public AddPresenter(pens.lab.app.belajaractivity.modul.add.AddContract.View view) {

        this.view = view;
    }

    @Override
    public void start() {}

    public void AddNewTask(){
        view.redirectAdd();
    }

}
