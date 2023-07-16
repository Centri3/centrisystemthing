Planet	"Smol/Lercurnis B I"
{
	ParentBody     "Kond"
	Class          "Ferria"
	Mass            0.011934
	Radius          1419.2
	InertiaMoment   0.37174
	Oblateness      0.0028152
	RotationOffset  85
	Obliquity       3
	EqAscendNode    120.9
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  0.3
    TempMapMaxTemp  52500

	Surface
	{
		Preset         "lercurnis_kond_smol.cfg"
		SurfStyle       0.08441
		Randomize      (1.023, 1.053, 0.809)
		colorDistMagn   0.04925
		colorDistFreq   176.91
		detailScale     128
		drivenDarkening -0.52672
		seaLevel        -0.38168
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0.46591
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2041
		heightTempGrad  0.625
		beachWidth      0.0011032
		tropicWidth     0.07
		mainFreq        1.374
		venusFreq       2
		venusMagn       1.145
		mareFreq        1
		mareDensity     0.35115
		terraceProb     0.29964
		erosion         0
		montesMagn      0.1
		montesFreq      5
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       12.988
		dunesFraction   0.57315
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      3.0772
		riversSin       6.77
		riftsMagn       0
		riftsFreq       2.493
		riftsSin        6.3576
		eqridgeMagn     0.35115
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  2.7481
		canyonsMagn     0
		canyonsFreq     0.41814
		canyonsFraction 0.74219
		cracksMagn      0
		cracksFreq      1
		cracksOctaves   15
		craterMagn      1
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0
		volcanoFreq     1
		volcanoDensity  1
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    0.9771
		volcanoRadius   1
		volcanoTemp     2335.9
		lavaCoverTidal  0.30534
		lavaCoverSun    0.29771
		lavaCoverYoung  0
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
		TempMapMaxTemp  52500
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00308472474
		SemiMajorAxis   0.00913076653
		Eccentricity    0.05
		Inclination     3
		AscendingNode   120.900786
		ArgOfPericenter -70.156256
		MeanAnomaly     -53.6294469
	}
}

