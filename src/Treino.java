import enums.FrequenciaSemanal;
import enums.NivelTreino;

import java.util.HashMap;

public class Treino {
    private static final HashMap<String, String[]> treinos = new HashMap<>();

    static {

        treinos.put("INICIANTE-3", new String[]{"Treino A: Peito e Bíceps - Supino reto, Supino inclinado com halteres, Rosca direta, Rosca martelo", "Treino B: Pernas e Ombros - Agachamento livre, Leg press, Desenvolvimento com halteres, Elevação lateral", "Treino C: Costas e Tríceps - Barra fixa, Remada curvada, Tríceps testa, Tríceps corda"});
        treinos.put("INICIANTE-4", new String[]{"Treino A: Peito e Bíceps - Supino reto, Supino inclinado, Crucifixo, Rosca direta, Rosca alternada", "Treino B: Pernas - Agachamento, Leg press, Passada, Cadeira extensora, Cadeira flexora", "Treino C: Costas e Tríceps - Barra fixa, Remada curvada, Puxador frontal, Tríceps pulley, Tríceps banco", "Treino D: Ombros e Abdômen - Desenvolvimento militar, Elevação frontal, Elevação lateral, Prancha abdominal, Abdominais, "});
        treinos.put("INICIANTE-5", new String[]{"Treino A: Peito - Supino reto, Supino inclinado, Crucifixo, Voador Fly ", "Treino B: Pernas - Agachamento, Leg press, Cadeira extensora, Stiff, leg press 180", "Treino C: Costas - Barra fixa, Remada curvada, Puxador articulado, Pullover com cabo", "Treino D: Ombros - Desenvolvimento com halteres, Elevação lateral, Elevação frontal, Encolhimento com barra", "Treino E: Cardio - 30 minutos de caminhada e 30 Minutos de Bicicleta",});

        treinos.put("INTERMEDIARIO-3", new String[]{"Treino A: Peito e Costas - Supino reto, Supino inclinado com halteres, Crucifixo inclinado, Barra fixa, Remada curvada, Puxador frontal", "Treino B: Pernas e Ombros - Agachamento livre, Leg press, Stiff, Cadeira extensora, Desenvolvimento com halteres, Elevação lateral, Encolhimento com barra", "Treino C: Bíceps, Tríceps e Abdômen - Rosca direta, Rosca alternada, Rosca martelo, Tríceps pulley, Tríceps francês, Prancha abdominal, Abdominais oblíquos"});
        treinos.put("INTERMEDIARIO-4", new String[]{"Treino A: Peito e Tríceps - Supino reto, Supino inclinado, Crucifixo reto, Tríceps corda, Tríceps testa, Tríceps banco", "Treino B: Pernas - Agachamento, Leg press, Cadeira extensora, Cadeira flexora, Stiff, Passada", "Treino C: Costas e Bíceps - Barra fixa, Remada curvada, Puxador articulado, Rosca direta, Rosca alternada, Rosca concentrada", "Treino D: Ombros - Desenvolvimento militar, Elevação lateral, Elevação frontal, Encolhimento com halteres,"});
        treinos.put("INTERMEDIARIO-5", new String[]{"Treino A: Peito - Supino reto, Supino inclinado, Crucifixo inclinado, supino fechado com anilha, Cross-over", "Treino B: Pernas - Agachamento, Leg press, Cadeira extensora, Cadeira flexora, Stiff, Gêmeos no leg press", "Treino C: Costas - Barra fixa, Remada curvada, Puxador articulado, Remada alta, Pullover com cabo", "Treino D: Ombros - Desenvolvimento com halteres, Elevação lateral, Elevação frontal, Encolhimento com barra, Desenvolvimento Arnold", "Treino E:Bíceps e Tríceps - Rosca direta, Rosca concentrada, Rosca martelo, Tríceps pulley, Tríceps francês, Tríceps corda"});

        treinos.put("AVANCADO-3", new String[]{"Treino A: Quadríceps e Posterios - Cadeira Extensora, Flexão Nordica Reversa, Hack, Leg Press, Stiff no smith, Flexão Nordica,Elevação Pélvica", "Treino B: Costas - Pulley frente, Puxada supinada, Puxada com triângulo, Remada curvada, Remada cavalinho, Remada Baixa", "Treino C: Tríceps e Biceps - Tríceps Testa, Tríceps Coice, Tríceps Polia, Mergulho no banco, Alternado Martelo, Rosca alternada "});
        treinos.put("AVANCADO-4", new String[]{"Treino A: Peito e Costas - Supino reto com halteres, Supino inclinado, Crucifixo inclinado, Barra fixa, Remada unilateral, supino fechado com anilha", "Treino B: Pernas - Agachamento profundo, Leg press, Stiff, Cadeira extensora, Passada com avanço, Elevação de panturrilha em pé", "Treino C: Bíceps e Tríceps - Rosca direta, Rosca martelo, Rosca concentrada, Tríceps corda, Tríceps francês, Mergulho nas paralelas", "Treino D: Ombros e Abdômen - Desenvolvimento Arnold, Elevação lateral com pausa, Encolhimento com barra, Prancha com peso, Abdominais bicicleta, Abdominais infra com elevação de quadril"});
        treinos.put("AVANCADO-5", new String[]{"Treino A: Peito e Bíceps - Supino reto, Supino inclinado, Crucifixo reto, supino fechado com anilha, Rosca direta barra W, Rosca alternada sentado, Rosca martelo", "Treino B: Pernas - Agachamento livre, Leg press 90, Stiff, Passada com avanço, Cadeira extensora, Elevação de panturrilha sentado", "Treino C: Costas e Tríceps - Barra fixa com peso, Remada curvada, Puxador articulado, Remada livre, Tríceps francês, Tríceps corda, Mergulho nas paralelas", "Treino D: Ombros - Desenvolvimento militar com barra, Desenvolvimento Arnold, Elevação frontal com anilhas, Elevação lateral com halteres, Encolhimento com halteres", "Treino E: Abdômen e Fortalecimento dos Paravertertebrais - Abdominal Remador, Giro russo, Abdominal Alpinista , Ponte de Quadril, Extensão de Costas, Superman, "});
    }

    public static String[] getTreino(NivelTreino nivel, FrequenciaSemanal frequencia) {
        return treinos.get(nivel.name() + "-" + frequencia.getDias());
    }
}
