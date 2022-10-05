package kaika.sakura.jetnoteapp.data

import kaika.sakura.jetnoteapp.model.Note

class NotesDataSource {
    fun loadNotes() : List<Note> {
        return listOf(
            Note(title = "Hawaii", description = "Staying a beach"),
            Note(title = "Beppu", description = "Taking a Hot Spring"),
            Note(title = "Amakusa", description = "Eating seafood")

        )
    }
}