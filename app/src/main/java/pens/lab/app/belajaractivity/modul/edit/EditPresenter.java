package pens.lab.app.belajaractivity.modul.edit;

/**
 * Created by fahrul on 13/03/19.
 */

public class EditPresenter implements EditContract.Presenter{
    private final EditContract.View view;

    public EditPresenter(EditContract.View view) {

        this.view = view;
    }

    @Override
    public void start() {}

    public void EditTask(){
        view.redirectEdit();
    }

}
