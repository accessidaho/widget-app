package widget.app

class WidgetController {

    def index() {
        [widgets: Widget.getAll()]
    }
}
