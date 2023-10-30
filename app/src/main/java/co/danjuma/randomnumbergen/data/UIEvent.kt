package co.danjuma.randomnumbergen.data


sealed class UIEvent {

    data class randomNumberEntered(val randomNumberEntered: Int) : UIEvent()

    object generateButtonClicked : UIEvent()

}