using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Task0 : MonoBehaviour
{
    [SerializeField] Text progress;
    [SerializeField] Image fillbar;

    float _amount;
    public float amount{
        get {
            return _amount;
        }
        set {
            if (value > 100)
            {
                _amount = 100;
               
            }
            else {
                _amount = value;
            }
            progress.text = _amount.ToString() + "%";
            fillbar.fillAmount = amount / 100;
            if (fillbar.fillAmount < 0.33f)
            {
                fillbar.color = Color.red;
            }
            else if (fillbar.fillAmount < 0.66f)
            {
                fillbar.color = Color.yellow;
            }
            else {
                fillbar.color = Color.green;
            }

        }
    }

    public void StartDownload()
    {
        StartCoroutine(Download());
    }

    IEnumerator Download() {
        yield return new WaitForSeconds(0.1f);
        amount += 2;
        if (amount >= 100)
        {
            TaskManager.instance.FinishTask(true);
        }
        else {
            StartCoroutine(Download());
        }

        
    }


}
