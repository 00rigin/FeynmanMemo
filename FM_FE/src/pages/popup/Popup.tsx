import "@pages/popup/Popup.css";
import Button from "@root/src/shared/components/Button";
import Input from "@root/src/shared/components/Input";
import withSuspense from "@src/shared/hoc/withSuspense";

const Popup = () => {
  return (
    <div className="p-2">
      <h1 className="font-mono text-2xl">Feynman Method</h1>
      <div className="grid gap-1 m-1">
        <Input title={'title'} placeholder="type a what you want to discover"/>
        <Input title={'description'} placeholder="explain it" />
        <Button title={"submit"}/>

      </div>
      {/* <InputField /> */}
    </div>
  );
};

export default withSuspense(Popup);
