Moon	"Ner/Caecus III II"
{
	ParentBody     "Oktdek"
	Class          "Aquaria"
	Mass            0.007
	Oblateness      0.00196
	Obliquity       0.1
	EqAscendNode    124
	TidalLocked     true

	EndogenousHeating 40.5
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Interior
	{
		Composition
		{
			Silicates	90
			Metals		10
		}
	}

	Surface
	{
		Preset         "caecus_oktdek_ner.cfg"
		SurfStyle       0.994
		Randomize      (0.952, -0.708, 0.215)
		colorDistMagn   0.0526
		colorDistFreq   179
		detailScale     128
		drivenDarkening 0
		seaLevel        0.277
		snowLevel       2
		tropicLatitude  0.0375
		icecapLatitude  2
		icecapHeight    0.128
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.348
		heightTempGrad  0.625
		beachWidth      0.000558
		tropicWidth     0.07
		mainFreq        2.02
		venusFreq       2
		venusMagn       0.954
		mareFreq        0.721
		mareDensity     0.179
		terraceProb     0.481
		erosion         0
		montesMagn      0.2
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      3.49
		riversSin       7.09
		riftsMagn       2
		riftsFreq       10
		riftsSin        10
		eqridgeMagn     1
		eqridgeWidth    1
		eqridgeModMagn  1.2
		eqridgeModFreq  3.44
		canyonsMagn     0
		canyonsFreq     0
		canyonsFraction 0
		cracksMagn      0.03
		cracksFreq      0.1
		cracksOctaves   15
		craterMagn      0.5
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.193
		volcanoFreq     0.619
		volcanoDensity  0.269
		volcanoOctaves  3
		volcanoActivity 0.208
		volcanoFlows    0.151
		volcanoRadius   0.154
		volcanoTemp     266
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.53840972
		SemiMajorAxisKm 669402.085
		Eccentricity    0.003
		Inclination     0.1
		AscendingNode   123.664122
		ArgOfPericenter 85.1908397
		MeanAnomaly     -96.1832061
	}
}

