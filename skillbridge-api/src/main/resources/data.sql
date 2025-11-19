
INSERT INTO usuarios (nome, email, area_atuacao, nivel_carreira, data_cadastro)
VALUES
    ('Carlos Pinheiro', 'carlos.pinheiro@fiap.com.br', 'Desenvolvimento', 'JUNIOR', '2025-01-15'),
    ('Bruno Bastos', 'bruno.bastos@fiap.com.br', 'Marketing Digital', 'PLENO', '2025-02-20'),
    ('Mauricio Alves', 'mauricio.alves@fiap.com.br', 'Análise de Dados', 'SENIOR', '2025-03-10'),
    ('Ana Costa', 'ana.costa@email.com', 'Gestão de Projetos', 'EM_TRANSICAO', '2025-04-05'),
    ('Carlos Mendes', 'carlos.mendes@email.com', 'Design UX/UI', 'ESPECIALISTA', '2025-05-12');

INSERT INTO competencias (nome, categoria, descricao)
VALUES
    ('Inteligência Artificial', 'Tecnológica', 'Fundamentos de IA e Machine Learning'),
    ('Análise de Dados', 'Tecnológica', 'Big Data, visualização e insights'),
    ('Cloud Computing', 'Tecnológica', 'AWS, Azure, GCP'),
    ('Pensamento Crítico', 'Humana', 'Capacidade de análise e solução de problemas'),
    ('Comunicação Eficaz', 'Humana', 'Habilidades interpessoais e apresentação'),
    ('Colaboração Remota', 'Humana', 'Trabalho em equipe em ambientes híbridos'),
    ('Liderança Ágil', 'Humana', 'Gestão adaptativa e facilitação de times'),
    ('Automação de Processos', 'Tecnológica', 'RPA e otimização de fluxos');

INSERT INTO trilhas (nome, descricao, nivel, carga_horaria, foco_principal)
VALUES
    ('IA para Desenvolvedores', 'Aprenda a integrar IA em aplicações reais', 'INTERMEDIARIO', 40, 'Inteligência Artificial'),
    ('Análise de Dados para Negócios', 'Transforme dados em decisões estratégicas', 'INICIANTE', 30, 'Análise de Dados'),
    ('Cloud Architect Essentials', 'Domine arquitetura em nuvem', 'AVANCADO', 60, 'Cloud Computing'),
    ('Soft Skills para o Futuro', 'Desenvolva competências humanas essenciais', 'INICIANTE', 20, 'Habilidades Humanas'),
    ('Automação e Eficiência', 'Otimize processos com automação', 'INTERMEDIARIO', 35, 'Automação');

INSERT INTO trilha_competencia (trilha_id, competencia_id)
VALUES
    (1, 1),  -- IA para Devs → Inteligência Artificial
    (1, 4),  -- IA para Devs → Pensamento Crítico
    (2, 2),  -- Análise de Dados → Análise de Dados
    (2, 4),  -- Análise de Dados → Pensamento Crítico
    (2, 5),  -- Análise de Dados → Comunicação Eficaz
    (3, 3),  -- Cloud Architect → Cloud Computing
    (3, 4),  -- Cloud Architect → Pensamento Crítico
    (4, 5),  -- Soft Skills → Comunicação Eficaz
    (4, 6),  -- Soft Skills → Colaboração Remota
    (4, 7),  -- Soft Skills → Liderança Ágil
    (5, 8),  -- Automação → Automação de Processos
    (5, 2);  -- Automação → Análise de Dados


INSERT INTO matriculas (usuario_id, trilha_id, data_inscricao, status)
VALUES
    (1, 1, '2025-06-01', 'EM_ANDAMENTO'),
    (1, 4, '2025-06-15', 'EM_ANDAMENTO'),
    (2, 2, '2025-07-01', 'CONCLUIDA'),
    (2, 5, '2025-08-10', 'EM_ANDAMENTO'),
    (3, 3, '2025-07-20', 'EM_ANDAMENTO'),
    (3, 1, '2025-09-05', 'PAUSADA'),
    (4, 4, '2025-08-15', 'CONCLUIDA'),
    (4, 2, '2025-09-20', 'EM_ANDAMENTO'),
    (5, 1, '2025-07-10', 'EM_ANDAMENTO'),
    (5, 5, '2025-10-01', 'EM_ANDAMENTO');
