package kaika.sakura.jetnoteapp.screen

import android.view.View
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import kaika.sakura.jetnoteapp.data.NotesDataSource
import kaika.sakura.jetnoteapp.model.Note

class NoteViewModel : ViewModel() {
    var noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NotesDataSource().loadNotes())
    }

    fun addNote(note: Note) {
        noteList.add(note)
    }

    fun removeNote(note: Note) {
        noteList.remove(note)
    }

    fun getAllNotes(): List<Note> {
        return noteList
    }
}