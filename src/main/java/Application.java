import com.adapter.FileReader;
import com.adapter.PdfReader;
import com.adapter.FileReaderAdapter;
import com.adapter.FileReaderInterface;

class Application {
    public void read(FileReaderInterface file){
        file.read();
    }
    public static void main(String[] args) {
        (new Application()).read(new FileReaderAdapter(new PdfReader()));
    }
} 