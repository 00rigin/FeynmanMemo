import "@pages/newtab/Newtab.css";
import "@pages/newtab/Newtab.scss";
import withSuspense from "@src/shared/hoc/withSuspense";
import useStorage from "@src/shared/hooks/useStorage";
import exampleThemeStorage from "@src/shared/storages/exampleThemeStorage";

const Newtab = () => {
  const theme = useStorage(exampleThemeStorage);

  return (
    <div className="App">
      <header className="App-header">
        hello world
      </header>
    </div>
  );
};

export default withSuspense(Newtab);
