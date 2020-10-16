package pens.lab.app.belajaractivity.modul.listToDo;

/**
 * Created by fahrul on 13/03/19.
 */

public class ListToDoPresenter implements ListToDoContract.Presenter{
    private final ListToDoContract.View view;


    public ListToDoPresenter(ListToDoContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void performAdd(String title){
        view.redirectToAdd();
    }

}
